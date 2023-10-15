package devutility.test.boot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import devutility.internal.models.BaseResponse;

@RestController
public class HomeController extends BaseController {
	@GetMapping("/")
	public ResponseEntity<?> home() {
		BaseResponse<Object> response = new BaseResponse<>();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}