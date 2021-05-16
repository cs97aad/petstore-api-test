package Pet;

import java.util.HashMap;
import java.util.List;
import io.restassured.*;
import io.restassured.common.mapper.*;
import io.restassured.response.*;

public class FindByStatus {
    private static String path = "findByStatus";
    private static Response findByStatusResponse = null;

    public static void getPetsByStatus(String status) {
        String URI = Pet.BaseURI + Pet.BasePath + path;
        findByStatusResponse = RestAssured.given()
                .queryParam("status", status)
                .get(URI);
    }

    public static int getStatusCode() {
        return findByStatusResponse.statusCode();
    }

    public static int getPetsByNameAndStatus(String status, String name) {
        List<HashMap<String, Object>> petDetails = findByStatusResponse.andReturn().as(new TypeRef<List<HashMap<String, Object>>>() {
        });
        int count = 0;
        for (HashMap<String, Object> pet : petDetails) {
            if (pet.get("name").equals(name) & pet.get("status").equals(status))
                count++;
            ;
        }
        System.out.println("Count is " + count);
        return count;
    }
}
