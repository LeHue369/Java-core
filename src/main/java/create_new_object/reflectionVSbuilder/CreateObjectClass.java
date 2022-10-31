package create_new_object.reflectionVSbuilder;

import lombok.Builder;

@Builder
public class CreateObjectClass {

    private String hue;
    private CreateObjectClass(String hue) {
        this.hue = hue;
    }
}
