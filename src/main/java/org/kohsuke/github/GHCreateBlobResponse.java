package org.kohsuke.github;

/**
 * The response that is returned when creating a blob
 * @author gmilow
 *
 */
public class GHCreateBlobResponse {
	private String url;
	private String sha;

	public String getUrl() {
		return url;
	}

	public String getSha() {
		return sha;
	}
}
