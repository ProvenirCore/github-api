package org.kohsuke.github;

/**
 * The response that is returned when creating a commit
 * @author gmilow
 *
 */
public class GHCreateCommitResponse {
	private String url;
	private String sha;

	public String getUrl() {
		return url;
	}

	public String getSha() {
		return sha;
	}
}
