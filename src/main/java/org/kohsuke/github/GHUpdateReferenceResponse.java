package org.kohsuke.github;

/**
 * The response that is returned when updating a reference
 * @author gmilow
 *
 */
public class GHUpdateReferenceResponse {
	private String url;
	private String ref;

	public String getUrl() {
		return url;
	}

	public String getRef() {
		return ref;
	}
}
