
package org.conjur.jenkins.credentials;

import static org.junit.Assert.assertFalse;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

@RunWith(MockitoJUnitRunner.class)

public class ConjurCredentialProviderTest {

	@Mock
	public ConjurCredentialProvider provider;

	@Test
	public void getStoreTest() {
		ConjurCredentialStore store = null;
		when(provider.getStore(any())).thenReturn(store);
		assertFalse(provider.getStore(any()) instanceof ConjurCredentialStore);
	}

	/*
	 * @Test(expected = RuntimeException.class) public void getCredentialsTest()
	 * throws Exception {
	 * 
	 * ConjurCredentialProvider classUnderTest = Mockito.spy(new
	 * ConjurCredentialProvider());
	 * 
	 * //Mockito.doReturn(Collections.emptyList()).when(classUnderTest.getClass().
	 * getDeclaredMethod("getCredentialsFromSupplier", any(), any(), any()));
	 * 
	 * 
	 * 
	 * // Stub the private method using Mockito //
	 * Mockito.doReturn(Collections.emptyList()) //
	 * .when(classUnderTest,Mockito.method(classUnderTest,
	 * "getCredentialsFromSupplier", any(), any(), any()));
	 * 
	 * //doReturn(Collections.emptyList()).when(classUnderTest).getCredentialIds(
	 * null, null, null, null, null); //.getCredentialsFromSupplier(any(), any(),
	 * any());
	 * 
	 * try (MockedStatic<ConjurCredentialProvider> mockedStaticCredentialsImpl =
	 * mockStatic(ConjurCredentialProvider.class)) {
	 * 
	 * //ConjurCredentialProvider conjurCredentialProvider =
	 * mock(ConjurCredentialProvider.class); // Create a spy
	 * //ConjurCredentialProvider classUnderTest =
	 * Mockito.spy(conjurCredentialProvider);
	 * 
	 * //doNothing().when(classUnderTest,"getCredentialsFromSupplier",any(),any(),
	 * any()).thenReturn(Collections.emptyList());
	 * 
	 * 
	 * 
	 * 
	 * ////when(classUnderTest, "getCredentialsFromSupplier", any(), any(), any())
	 * //.thenReturn(Collections.emptyList());
	 * 
	 * //Mockito.when(Mockito(classUnderTest),"getCredentialsFromSupplier",any(),any
	 * (),any()).thenReturn(Collections.emptyList());
	 * 
	 * 
	 * Mockito.when(classUnderTest,"getCredentialsFromSupplier", any(), any(),
	 * any()) .thenReturn(Collections.emptyList());
	 * 
	 * 
	 * //}
	 * 
	 * }
	 */
}