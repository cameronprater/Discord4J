package sx.blah.discord.json.requests;

/**
 * This request is sent to resume a connection after being redirected.
 */
public class ResumeRequest {

	/**
	 * The payload for this request.
	 */
	public ResumeObject d;

	/**
	 * 6 is the opcode for resumes.
	 */
	public int op = 6;

	public ResumeRequest(String session_id, long seq) {
		d = new ResumeObject(session_id, seq);
	}

	/**
	 * The payload to send regarding resume info.
	 */
	public static class ResumeObject {

		/**
		 * The session id to resume.
		 */
		public String session_id;

		/**
		 * This is the last cached value of {@link sx.blah.discord.json.responses.EventResponse#s}.
		 */
		public long seq;

		public ResumeObject(String session_id, long seq) {
			this.session_id = session_id;
			this.seq = seq;
		}
	}
}
