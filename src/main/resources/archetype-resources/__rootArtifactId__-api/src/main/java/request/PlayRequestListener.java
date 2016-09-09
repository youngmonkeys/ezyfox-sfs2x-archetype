#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * 
 */
package ${package}.request;

import com.tvd12.ezyfox.core.annotation.ClientRequestListener;
import com.tvd12.ezyfox.core.content.AppContext;

/**
 * @author tavandung12
 *
 */
@ClientRequestListener(command = "play")
public class PlayRequestListener {

    public void execute(AppContext context, Object room, Object user) {
        
    }
    
}
