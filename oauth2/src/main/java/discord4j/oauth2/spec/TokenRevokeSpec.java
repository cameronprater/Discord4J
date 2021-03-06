/*
 * This file is part of Discord4J.
 *
 * Discord4J is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Discord4J is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Discord4J. If not, see <http://www.gnu.org/licenses/>.
 */

package discord4j.oauth2.spec;

import discord4j.core.spec.Spec;
import discord4j.discordjson.json.TokenRevokeRequest;

/** Spec used to revoke a token. */
public class TokenRevokeSpec implements Spec<TokenRevokeRequest> {

    private long clientId;
    private String clientSecret;
    private String token;

    /**
     * Sets the client ID of the Discord application that the token was issued to.
     *
     * @param clientId The client ID.
     * @return This spec.
     */
    public TokenRevokeSpec setClientId(long clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Sets the client secret of the Discord application that the token was issued to.
     *
     * @param clientSecret The client secret.
     * @return This spec.
     */
    public TokenRevokeSpec setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Sets the token to revoke.
     *
     * @param token The token to revoke.
     * @return This spec.
     */
    public TokenRevokeSpec setToken(String token) {
        this.token = token;
        return this;
    }

    @Override
    public TokenRevokeRequest asRequest() {
        return TokenRevokeRequest.builder()
                .clientId(clientId)
                .clientSecret(clientSecret)
                .token(token)
                .build();
    }
}
