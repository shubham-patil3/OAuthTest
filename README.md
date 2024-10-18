# OAuthTest

OAuth Flow
Client Request: The client (e.g., a web or mobile app) requests access to a protected resource on the server.
Authorization Request: The client redirects the user to the authorization server (e.g., Google, Facebook) to request authorization.
User Authentication: The user authenticates with the authorization server.
Authorization Grant: The authorization server provides an authorization grant (e.g., authorization code) to the client.
Token Request: The client exchanges the authorization grant for an access token by making a request to the authorization server's token endpoint.
Access Token: The authorization server returns an access token to the client.
API Request: The client uses the access token to make an authenticated request to the protected resource on the server.
Resource Access: The server validates the access token and, if valid, provides access to the protected resource.