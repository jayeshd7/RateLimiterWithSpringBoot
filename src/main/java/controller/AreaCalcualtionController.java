package controller;


import dto.AreaV1;
import dto.RectangleDimensionsV1;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/area", consumes = MediaType.APPLICATION_JSON_VALUE)
public class AreaCalcualtionController {

    @PostMapping(value = "/rectangle", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AreaV1> rectangle(@RequestBody RectangleDimensionsV1 dimensions) {

        return ResponseEntity.ok(new AreaV1("rectangle", dimensions.getLength() * dimensions.getWidth()));
    }
}
