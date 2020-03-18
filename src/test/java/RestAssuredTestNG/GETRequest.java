package RestAssuredTestNG;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GETRequest {
	
	@Test
	public void checkChennaiWeather() {
		given()
		.when()
		.get("http://restapi.demoqa.com/utilities/weather/city/Chennai")
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.assertThat().body("City", equalTo("Chennai"));
	}

}
