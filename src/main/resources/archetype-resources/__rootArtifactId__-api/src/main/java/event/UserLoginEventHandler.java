#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * 
 */
package ${package}.event;

import com.tvd12.ezyfox.core.annotation.ServerEventHandler;
import com.tvd12.ezyfox.core.command.Log;
import com.tvd12.ezyfox.core.constants.ServerEvent;
import com.tvd12.ezyfox.core.content.AppContext;
import com.tvd12.ezyfox.core.entities.ApiLogin;

/**
 * @author tavandung12
 *
 */
@ServerEventHandler(event = ServerEvent.USER_LOGIN)
public class UserLoginEventHandler {

    public void handle(AppContext context, ApiLogin login) {
        context.command(Log.class).from(this).info("welcome {}", login.username());
    }
    
}
