#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * 
 */
package ${package}.extension;

import com.tvd12.ezyfox.core.annotation.PackagesScan;

/**
 * @author tavandung12
 *
 */
@PackagesScan(packages = {
        "${symbol_dollar}{package}.entities", 
        "${symbol_dollar}{package}.event",
        })
public class AppConfig {

}
