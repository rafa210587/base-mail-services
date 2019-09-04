package com.mail.common.configuration.api;

import java.net.URI;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import com.mail.common.util.Constants;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Class responsible for performing load balance and service call  
 * @author alan.franco
 */
@Service
@AllArgsConstructor
@Slf4j
public class ClientDiscoveyServiceFactory extends IntegrationApplicationProperties {
	
	private LoadBalancerClient loadBalancer;
	
	public URI getProfileUri(String serviceId) {
		ServiceInstance instance = loadBalancer.choose(serviceId);
		URI uri = null;
		if (instance != null) {
			uri = UriComponentsBuilder.fromHttpUrl((instance.isSecure() ? Constants.HTTPS : Constants.HTTP) + instance.getHost() + ":" + instance.getPort()).build().toUri();
		}else {
			if(serviceId.contains(Constants.HTTP) || serviceId.contains(Constants.HTTPS)) {
				uri = UriComponentsBuilder.fromHttpUrl(serviceId).build().toUri();
			}
		}
		return uri;
	}

	public String formatFinalUrl(String url, String endPoint) {
		String urlFinal = getProfileUri(url).toString();
		return String.format("%s/%s/%s", urlFinal, url, endPoint);
	}
	
	
	public String getUrlService(String serviceId) {
		URI serviceUri = getProfileUri(serviceId);
		if (serviceUri == null) {
			log.error("Service could not be found {}", serviceId);
			return "";
		}
		return serviceUri.toString();
	}
	
	public String url(String integracao, String contexto, String uri) {
		String host = getUrlService(integracao);
		return host.concat(contexto).concat(uri);
	}

	
}
