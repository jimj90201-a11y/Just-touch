
package gamerofpro.justtouch.client;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JustTouchClient implements ClientModInitializer {
    public static final String MOD_ID = "justtouch";
    public static final Logger LOGGER =
            LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("Just Touch initialized!");
    }
}
