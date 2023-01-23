package lotto.model;

import lotto.utils.CreateRandomLottoNumber;

import java.util.ArrayList;
import java.util.List;

public class LottoGenerator {
    private final int moneyUnit=1000;
    private final int purchaseMoney;
    private final int cnt;

    private final List<Lotto> lottos;

    public LottoGenerator(String purchaseMoney) {
        this.purchaseMoney=Integer.parseInt(purchaseMoney);
        this.cnt=this.purchaseMoney/moneyUnit;
        lottos =new ArrayList<>();
        purchaseLotto();
    }

    private void purchaseLotto(){
        int cnt=this.cnt;

        while(cnt>0){
            addLotto(CreateRandomLottoNumber.createNumber());
            cnt-=1;
        }
    }

    private void addLotto(List<Integer> lottoNumbers){
        Lotto lotto=new Lotto(lottoNumbers);
        this.lottos.add(lotto);
    }

    public List<Lotto> getLottos() {
        return lottos;
    }

    public int getCnt() {
        return cnt;
    }
}
