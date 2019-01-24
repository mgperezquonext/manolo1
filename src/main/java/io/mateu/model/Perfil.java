package io.mateu.model;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Image;
import io.mateu.mdd.core.annotations.SameLine;
import lombok.Getter;

@Getter
public class Perfil {

    private String nombre = "Manolo";

    @SameLine
    private Image foto =
            new Image("",
                    new ExternalResource("https://avatars.schd.ws/5/12/2660785/avatar.jpg.320x320px.jpg"));

    private String texto = "bwdh wehwedowe dwed wudweud ewdiwedw ediwediwed" +
            "wudewudhwed wediwediwed wdiwdiwedwed wdiwed" +
            "wudweuduwed wdi widbw diw diw dw" +
            "wdwuendwe diw diwd wid iw ede whed ehd" +
            "wdiewidwed wied edwd i we" +
            "weduiwed wediwd w dw diwd wi di wd" +
            "weudwidw";

}
