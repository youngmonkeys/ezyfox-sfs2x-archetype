#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * 
 */
package ${package}.extension;

import com.tvd12.ezyfox.core.annotation.PackagesScan;
import com.tvd12.ezyfox.core.annotation.RoomContextConfiguration;

/**
 * @author tavandung12
 *
 */
@PackagesScan(packages = {
        "${symbol_dollar}{package}.request"})
@RoomContextConfiguration
public class RoomConfig {

}
