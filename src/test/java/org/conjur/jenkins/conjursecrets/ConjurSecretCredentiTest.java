
package org.conjur.jenkins.conjursecrets;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.when;

import java.io.IOException;

import org.conjur.jenkins.api.ConjurAPI;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.MockedStatic;
import org.mockito.MockedStatic.Verification;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import hidden.jth.org.apache.http.impl.client.CloseableHttpClient;
import hidden.jth.org.apache.http.impl.client.HttpClients;
import hudson.model.ModelObject;

@RunWith(MockitoJUnitRunner.class)
public class ConjurSecretCredentiTest {

	@Test
	public void mockCredentialFromContextIfNeeded() {
		try (MockedStatic<ConjurSecretCredentials> mockedStaticConjurSecretCredentials = mockStatic(
				ConjurSecretCredentials.class)) {
			final ConjurSecretCredentials conjurSecretCredentials = mock(ConjurSecretCredentials.class);
			mock(ModelObject.class);
			final ModelObject context = mock(ModelObject.class);
			String credentialID = "Id74";
			mockedStaticConjurSecretCredentials.when(() -> ConjurSecretCredentials
					.credentialFromContextIfNeeded(conjurSecretCredentials, credentialID, context))
					.thenReturn(conjurSecretCredentials);

		}

	}

	@Test
	public void mockCredentialWithId() {
		try (MockedStatic<ConjurSecretCredentials> mockedStaticConjurSecretCredentials = mockStatic(
				ConjurSecretCredentials.class)) {
			final ConjurSecretCredentials conjurSecretCredentialsId = mock(ConjurSecretCredentials.class);
			mockStatic(ModelObject.class);
			final ModelObject context = mock(ModelObject.class);
			String credentialID = "Id412";
			mockedStaticConjurSecretCredentials
					.when(() -> ConjurSecretCredentials.credentialWithID(credentialID, context))
					.thenReturn(conjurSecretCredentialsId);

		}
	}
}