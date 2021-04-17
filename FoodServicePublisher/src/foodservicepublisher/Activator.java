package foodservicepublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Order food service started");
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Order food service stopped");
	}

}
