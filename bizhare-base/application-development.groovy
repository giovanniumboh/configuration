// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'com.bizhare.common.security.Member'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'com.bizhare.common.security.MemberRole'
grails.plugin.springsecurity.authority.className = 'com.bizhare.common.security.Role'
grails.plugin.springsecurity.userLookup.usernamePropertyName = 'email'
base.url.service = "http://localhost:8090"
base.url.web = "http://localhost:8100"
member.resource.url = "C:/biz/data/nfsdir/resources/cms/member"
member.private.url = "C:/biz/data/nfsdir/private/cms/member"

grails.plugin.springsecurity.controllerAnnotations.staticRules = [
        [pattern: '/', access: ['permitAll']],
        [pattern: '/error', access: ['permitAll']],
        [pattern: '/index', access: ['permitAll']],
        [pattern: '/index.gsp', access: ['permitAll']],
        [pattern: '/shutdown', access: ['permitAll']],
        [pattern: '/assets/**', access: ['permitAll']],
        [pattern: '/**/js/**', access: ['permitAll']],
        [pattern: '/**/css/**', access: ['permitAll']],
        [pattern: '/**/images/**', access: ['permitAll']],
        [pattern: '/**/favicon.ico', access: ['permitAll']],
        [pattern: '/register/**', access: ['isFullyAuthenticated()']],
        [pattern: '/application/**', access: ['isFullyAuthenticated()']],
        [pattern: '/member/**', access: ['isFullyAuthenticated()']],
        [pattern: '/business/**', access: ['isFullyAuthenticated()']],
        [pattern: '/bizhareMindset/**', access: ['isFullyAuthenticated()']],
        [pattern: '/commonFile/**', access: ['isFullyAuthenticated()']],
        [pattern: '/invest/**', access: ['isFullyAuthenticated()']],
        [pattern: '/withdrawal/**', access: ['isFullyAuthenticated()']],
        [pattern: '/businessPerformance/**', access: ['isFullyAuthenticated()']],
        [pattern: '/businessProfitSharing/**', access: ['isFullyAuthenticated()']],
        [pattern: '/menu/**', access: ['isFullyAuthenticated()']],
        [pattern: '/role/**', access: ['isFullyAuthenticated()']],
        [pattern: '/operator/**', access: ['isFullyAuthenticated()']],
        [pattern: '/parameter/**', access: ['isFullyAuthenticated()']]
]

grails.plugin.springsecurity.rest.login.endpointUrl = "/api/login"
grails.plugin.springsecurity.rest.token.validation.endpointUrl = "/api/validate"
grails.plugin.springsecurity.rest.token.storage.jwt.expiration = 1800
grails.plugin.springsecurity.filterChain.chainMap = [
        [
                pattern: '/business/findAllBusiness',
                filters: 'anonymousAuthenticationFilter'
        ],
        [
                pattern: '/business/findAllBusinessParent',
                filters: 'anonymousAuthenticationFilter'
        ],
        [
                pattern: '/business/findOneBusiness',
                filters: 'anonymousAuthenticationFilter'
        ],
        [
                pattern: '/business/findOneBusinessParent',
                filters: 'anonymousAuthenticationFilter'
        ],
        [
                pattern: '/register/**',
                filters: 'anonymousAuthenticationFilter'
        ],
        [
                pattern: '/commonFile/getFileBase64',
                filters: 'anonymousAuthenticationFilter'
        ],
        [
                pattern: '/commonFile/getFile',
                filters: 'anonymousAuthenticationFilter'
        ],
        [
                pattern: '/bizhareMindset/**',
                filters: 'anonymousAuthenticationFilter'
        ],
        [
                pattern: '/oauth/**',
                filters: 'JOINED_FILTERS,-restTokenValidationFilter,-restExceptionTranslationFilter'
        ],
        [
                pattern: '/**',
                filters: 'JOINED_FILTERS,-anonymousAuthenticationFilter,-exceptionTranslationFilter,-authenticationProcessingFilter,-securityContextPersistenceFilter,-rememberMeAuthenticationFilter'
        ]
]

grails.plugin.springsecurity.debug.useFilter = true
grails {
    mail {
        host = "smtp.emailarray.com"
        port = 465
        username = "admin@bizhare.id"
        password = "password"
        props = ["mail.smtp.auth"                  : "true",
                 "mail.smtp.socketFactory.port"    : "465",
                 "mail.smtp.socketFactory.class"   : "javax.net.ssl.SSLSocketFactory",
                 "mail.smtp.socketFactory.fallback": "false",
                 "mail.smtp.starttls.required"     : "true",
                 "mail.debug"                      : "false"]

    }
}
grails.mail.default.from = "no-reply@bizhare.id"