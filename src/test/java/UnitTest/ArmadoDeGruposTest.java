package UnitTest;

import com.organizador_torneos.model.Jugador;
import com.organizador_torneos.model.Pareja;
import com.organizador_torneos.model.Torneo;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class ArmadoDeGruposTest {
    @Test
    public void cuatroParejasFormanUnGrupo(){
        Jugador jugador1 = new Jugador("prueba1");
        Jugador jugador2 = new Jugador("prueba2");

        Pareja pareja1 = new Pareja();
        pareja1.setJugadores(jugador1, jugador2);

        Torneo torneo = new Torneo(LocalDateTime.now(), "7ma");

        torneo.anotarParticipantes(pareja1);
        torneo.anotarParticipantes(pareja1);
        torneo.anotarParticipantes(pareja1);
        torneo.anotarParticipantes(pareja1);
        torneo.armadoDeGrupos();

        Assert.assertEquals(1, torneo.getGrupos().size());

    }

    @Test
    public void ochoParejasFormanDosGrupos(){
        Jugador jugador1 = new Jugador("prueba1");
        Jugador jugador2 = new Jugador("prueba2");

        Pareja pareja1 = new Pareja();
        pareja1.setJugadores(jugador1, jugador2);

        Torneo torneo = new Torneo(LocalDateTime.now(), "7ma");

        torneo.anotarParticipantes(pareja1);
        torneo.anotarParticipantes(pareja1);
        torneo.anotarParticipantes(pareja1);
        torneo.anotarParticipantes(pareja1);
        torneo.anotarParticipantes(pareja1);
        torneo.anotarParticipantes(pareja1);
        torneo.anotarParticipantes(pareja1);
        torneo.anotarParticipantes(pareja1);
        torneo.armadoDeGrupos();

        Assert.assertEquals(2, torneo.getGrupos().size());
    }

    @Test
    public void nueveParejasFormanDosGruposUnoConCincoOtroConCuatro(){
        Jugador jugador1 = new Jugador("prueba1");
        Jugador jugador2 = new Jugador("prueba2");

        Pareja pareja1 = new Pareja();
        pareja1.setJugadores(jugador1, jugador2);

        Torneo torneo = new Torneo(LocalDateTime.now(), "7ma");

        torneo.anotarParticipantes(pareja1);
        torneo.anotarParticipantes(pareja1);
        torneo.anotarParticipantes(pareja1);
        torneo.anotarParticipantes(pareja1);
        torneo.anotarParticipantes(pareja1);
        torneo.anotarParticipantes(pareja1);
        torneo.anotarParticipantes(pareja1);
        torneo.anotarParticipantes(pareja1);
        torneo.anotarParticipantes(pareja1);
        torneo.armadoDeGrupos();

        Assert.assertEquals(2, torneo.getGrupos().size());
        Assert.assertEquals(5, torneo.getGrupos().get(0).parejas());
        Assert.assertEquals(4, torneo.getGrupos().get(1).parejas());
    }
}
