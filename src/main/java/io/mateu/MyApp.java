package io.mateu;

import io.mateu.mdd.core.annotations.Action;
import io.mateu.mdd.core.app.AbstractAction;
import io.mateu.mdd.core.app.MDDOpenCRUDAction;
import io.mateu.mdd.core.app.SimpleMDDApplication;
import io.mateu.mdd.core.util.Helper;
import io.mateu.model.Perfil;
import io.mateu.model.Proyecto;
import io.mateu.model.Suscriptor;

import java.util.List;

public class MyApp extends SimpleMDDApplication {

    @Action(order = 1)
    public Perfil perfil() {
        return new Perfil();
    }

    @Action(order = 3)
    public void suscribirme(String nombre, String email) throws Throwable {
        Helper.transact(em -> {
            em.persist(new Suscriptor(email, nombre));
        });
    }

    @Action(order = 2)
    public List<Proyecto> proyectos() throws Throwable {
        return Helper.selectObjects(
                "select x from " + Proyecto.class.getName() +
                        " x where x.visible = true order by x.nombre");
    }

    @Action(order = 4)
    public AbstractAction proys() {
        return new MDDOpenCRUDAction(Proyecto.class);
    }

    @Action(order = 5)
    public AbstractAction suscriptores() {
        return new MDDOpenCRUDAction(Suscriptor.class);
    }

}