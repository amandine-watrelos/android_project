package fil.android.project.mydofusprofessions.data.repository.detail.locale;

import java.util.List;

import fil.android.project.mydofusprofessions.data.database.MyProfessionsDatabase;
import fil.android.project.mydofusprofessions.data.database.entity.ProfessionEntity;
import io.reactivex.Completable;
import io.reactivex.Single;

public class ProfessionDetailLocaleDataSource {

    private MyProfessionsDatabase myProfessionsDatabase;

    public ProfessionDetailLocaleDataSource(MyProfessionsDatabase myProfessionsDatabase) {
        this.myProfessionsDatabase = myProfessionsDatabase;
    }

    public Completable markProfessionAsLearned(ProfessionEntity professionEntity) {
        return myProfessionsDatabase.itemDao().markProfessionAsLearned(professionEntity);
    }

    public Completable unmarkProfessionAsLearned(String professionId) {
        return myProfessionsDatabase.itemDao().unmarkProfessionAsLearned(professionId);
    }

    public Single<List<String>> getLearnedProfessionIdList() {
        return myProfessionsDatabase.itemDao().getLearnedProfessionIdList();
    }
}