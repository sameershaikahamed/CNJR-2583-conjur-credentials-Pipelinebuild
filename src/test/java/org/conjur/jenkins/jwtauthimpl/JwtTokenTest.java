
package org.conjur.jenkins.jwtauthimpl;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.conjur.jenkins.jwtauth.impl.JwtToken;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockedStatic;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

public class JwtTokenTest {

	@Test
	public void mockSign() {
		JwtToken jwtToken = mock(JwtToken.class);
		when(jwtToken.sign()).thenReturn("Signing Token");
		// Your test logic here
		System.out.println(jwtToken.sign()); // Should print "Mocked"

		// Verify that the method was called
		verify(jwtToken).sign();

	}

	@Test
	public void mockGetToken() {
		try (MockedStatic<JwtToken> jwtTokenTestMockedStatic = mockStatic(JwtToken.class)) {
			mock(JwtToken.class);
			Object context = "secretId";
			jwtTokenTestMockedStatic.when(() -> JwtToken.getToken(context)).thenReturn("secret retrival " + context);

		}
	}

	@Test
	public void mockGetUnsignedToken() {
		try (MockedStatic<JwtToken> jwtTokenTestMockedStatic = mockStatic(JwtToken.class)) {
			JwtToken jwtToken2 = mock(JwtToken.class);
			String pluginAction = " sdfghjkl";
			jwtTokenTestMockedStatic.when(() -> JwtToken.getUnsignedToken(pluginAction, jwtToken2))
					.thenReturn(jwtToken2);
		}

	}
}