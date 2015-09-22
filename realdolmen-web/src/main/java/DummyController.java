import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class DummyController {

    private Integer jupiler = 0;

    private Integer leffe = 0;

    private Integer duvel = 0;

    public Integer getJupiler() {
        return jupiler;
    }

    public Integer getLeffe() {
        return leffe;
    }

    public Integer getDuvel() {
        return duvel;
    }

    public void increaseJupiler() {
        jupiler++;
    }

    public void increaseLeffe() {
        leffe++;
    }

    public void increaseDuvel() {
        duvel++;
    }

    public void setJupiler(Integer jupiler) {
        this.jupiler = jupiler;
    }

    public void setLeffe(Integer leffe) {
        this.leffe = leffe;
    }

    public void setDuvel(Integer duvel) {
        this.duvel = duvel;
    }
}
