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
        LEDViewModel ledViewModel = new LEDViewModel(true, "container", "control0");
       // this call to Models.toRaw initializes Knockout
       // so we can register the LED component.
        Models.toRaw(ledViewModel);
        LED.registerLED();
        LedBoard ledBoard = new LedBoard();
        ledBoard.getLeds().add(new LEDViewModel(true,"led1","control1"));
        ledBoard.getLeds().add(new LEDViewModel(true,"led2","control2"));
        ledBoard.getLeds().add(new LEDViewModel(false,"led3","control3"));
        ledBoard.getLeds().add(new LEDViewModel(true,"led4","control4"));
        ledBoard.getLeds().add(new LEDViewModel(true,"led5","control5"));
        ledBoard.getLeds().add(new LEDViewModel(true,"led6","control6"));
        ledBoard.getLeds().add(new LEDViewModel(true,"led7","control7"));
        ledBoard.applyBindings();
//        ledViewModel.applyBindings();
    }

}
