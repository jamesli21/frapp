package co.tomlee.frapp.appnet;

public final class Stream {
	private final String path;
	
	public Stream(final String path) {
		this.path = path;
	}
	
	public String getPath() {
		return path;
	}
	
	public int hashCode() {
		return path.hashCode();
	}
	
	public boolean equals(Object other) {
		if (other instanceof Stream) {
			final Stream stream = (Stream) other;
			return path.equals(stream.path);
		}
		return false;
	}
	
	public static final Stream MY_STREAM = new Stream("/stream/0/posts/stream");
	public static final Stream GLOBAL_STREAM = new Stream("/stream/0/posts/stream/global");
	public static final Stream MENTIONS_STREAM = new Stream("/stream/0/users/me/mentions");
}
