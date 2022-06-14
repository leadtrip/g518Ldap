package g518ldap

import grails.plugin.springsecurity.annotation.Secured
import org.springframework.security.core.context.SecurityContextHolder

@Secured( ["IS_AUTHENTICATED_FULLY"] )
class HomeController {

    def index() {
        [user: SecurityContextHolder?.context]
    }
}
