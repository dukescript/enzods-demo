package com.dukescript.enzods;

import com.dukescript.enzods.led.LED;
import net.java.html.boot.BrowserBuilder;
import net.java.html.json.Models;

public final class Main {
    private Main() {
    }
    
    public static void main(String... args) throws Exception {
        BrowserBuilder.newBrowser().
            loadPage("pages/index.html").
            loadClass(Main.class).
            invoke("onPageLoad", args).
            showAndWait();
        System.exit(0);
    }

    /**
     * Called when the page is ready.
     */
    public static void onPageLoad() throws Exception {
       LEDViewModel ledViewModel = new LEDViewModel(true, "container");
       Models.toRaw(ledViewModel);
        LED.registerLED();
        ledViewModel.applyBindings();
    }
    
}
