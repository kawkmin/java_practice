package lotto.model;

import lotto.utils.CreateRandomLottoNumber;
import lotto.utils.PurchaseValidator;

import java.util.List;

public class LottoGenerator {
    private final int moneyUnit=1000;
    private final int purchaseMoney;
    private final int cnt;

    private List<Lotto> purchaseLottos;

    public LottoGenerator(String purchaseMoney) {
        this.purchaseMoney=Integer.parseInt(purchaseMoney);
        this.cnt=this.purchaseMoney/moneyUnit;
        purchaseLotto();
    }

    private void purchaseLotto(){
        int cnt=this.cnt;

        while(cnt>0){
            addLotto(CreateRandomLottoNumber.createNumber());
            cnt--;
        }
    }

    private void addLotto(List<Integer> lottoNumbers){
        this.purchaseLottos.add(new Lotto(lottoNumbers));
    }
}
