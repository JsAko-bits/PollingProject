package classes;

public class ResponseEntity {
		
		private String message;
		private boolean error;
		
		public ResponseEntity() {
			// TODO Auto-generated constructor stub
		}
		
		public ResponseEntity(String message, boolean error) {
			this.message = message;
			this.error = error;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public boolean isError() {
			return error;
		}

		public void setError(boolean error) {
			this.error = error;
		}
		
}
