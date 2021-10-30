<!-- links -->
[Okta Sign-In Widget]: https://developer.okta.com/
[authentication]: https://developer.okta.com/docs/concepts/authentication/
[HTTPS]: https://www.okta.com/identity-101/http-vs-https/
[OAuth2]: https://de.wikipedia.org/wiki/OAuth
[OpenID Connect]: https://developer.okta.com/docs/reference/api/oidc/
[bootstrap]: https://getbootstrap.com/
[hosted flow]: https://developer.okta.com/docs/concepts/okta-hosted-flows/
[redirect to a sigin-in page]: https://developer.okta.com/docs/guides/sign-into-web-app/go/redirect-to-sign-in/

[authorization code flow]: https://developer.okta.com/docs/concepts/oauth-openid/#authorization-code-flow
[PKCE]: https://developer.okta.com/docs/concepts/oauth-openid/#authorization-code-flow-with-pkce
[implicit flow]: https://developer.okta.com/docs/concepts/oauth-openid/#implicit-flow
[OAuth]: https://developer.okta.com/docs/concepts/oauth-openid/
[Custom Authorization Server]: https://developer.okta.com/docs/guides/customize-authz-server/overview/
[Authorization Server]: https://developer.okta.com/docs/concepts/auth-servers/#which-authorization-server-should-you-use
[Social Login]: https://developer.okta.com/docs/concepts/social-login/
[Identity Engine]: https://developer.okta.com/docs/guides/oie-intro/
<!-- end links -->

# Full Stack: e-Commerce application development (Angular and Java Spring Boot)

<!-- START GITHUB ONLY -->
[![npm version](https://img.shields.io/npm/v/@okta/okta-signin-widget.svg?style=flat-square)](https://www.npmjs.com/package/@okta/okta-signin-widget)
<!-- END GITHUB ONLY -->

This application is built by Angular for front-end and Spring Boot with REST APIs and MySQL database for back-end.

This project implements user registration and login, member access, product display, product search, order management service, using [HTTPS][], [OpenID Connect][] & [OAuth2][] to ensure the security of front-end and back-end interaction.

## Content
<!-- TOC is generated using Markdown All in One -->
- [Requirement](#requirement)
- [Front-end](#front-end)
  - [Angular](#javascript)
  - [Bootstrap](#bootstrap)
- [Back-end](#back-end)
  - [Spring Boot](#spring-boot)
  - [REST APIs](#REST-API)
  - [Database](#database)
- [Security](#security)
  - [OktaSignIn](#oktasignin)
  - [OpenID Connect](#OpenID-Connect)
  - [OAuth2](#showsignin)

## Front-end

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 12.2.6.

## Setup

```bash
npm i @okta/okta-angular@3.2.2
npm i @okta/okta-auth-js
npm install
```

## Run

1. Open the Spring boot project and run it;
2. Open the Angular project:

```Typescript
npm start
// or
ng serve
```

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.
