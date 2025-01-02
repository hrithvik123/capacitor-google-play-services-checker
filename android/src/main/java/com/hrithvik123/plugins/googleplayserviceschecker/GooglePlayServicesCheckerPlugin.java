package com.hrithvik123.plugins.googleplayserviceschecker;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "GooglePlayServicesChecker")
public class GooglePlayServicesCheckerPlugin extends Plugin {

    private GooglePlayServicesChecker implementation;

    @Override
    public void load() {
        implementation = new GooglePlayServicesChecker(getActivity());
    }

    @PluginMethod
    public void isGooglePlayServicesAvailable(PluginCall call) {
        try {
            boolean isAvailable = implementation.isGooglePlayServicesAvailable();
            call.resolve(new JSObject().put("available", isAvailable));
        } catch (Exception exception) {
            call.reject(exception.getLocalizedMessage());
        }
    }
}
