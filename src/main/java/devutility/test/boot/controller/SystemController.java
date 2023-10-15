package devutility.test.boot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import devutility.internal.models.BaseResponse;

@RequestMapping("system")
@RestController
public class SystemController extends BaseController {
	@GetMapping("httpstatus")
	public ResponseEntity<?> httpStatus(int status) {
		BaseResponse<Object> response = new BaseResponse<>();
		response.setData(status);

		HttpStatus httpStatus = HttpStatus.valueOf(status);
		return new ResponseEntity<>(response, httpStatus);
	}

	@GetMapping("long-request")
	public ResponseEntity<?> longRequest(@RequestParam(required = false, defaultValue = "3000") long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		int status = 200;
		BaseResponse<Object> response = new BaseResponse<>();
		response.setData(status);

		HttpStatus httpStatus = HttpStatus.valueOf(status);
		return new ResponseEntity<>(response, httpStatus);
	}

	@GetMapping("404")
	public ResponseEntity<?> notFound() {
		HttpStatus httpStatus = HttpStatus.valueOf(404);
		return new ResponseEntity<>(httpStatus);
	}
}