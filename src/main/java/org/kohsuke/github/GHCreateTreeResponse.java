package org.kohsuke.github;

/**
 * The response that is returned when creating a blob
 * @author gmilow
 *
 */
public class GHCreateTreeResponse {
	private String url;
	private String sha;
	private GHTreeEntry[] tree;

	public GHTreeEntry[] getTree() {
		return tree.clone();
	}

	public String getUrl() {
		return url;
	}

	public String getSha() {
		return sha;
	}
}
