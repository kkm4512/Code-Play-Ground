package bank.시나리오.시나리오1;

import java.util.ArrayList;
import java.util.List;

/**
 * 각 계좌의 거래내역을 기록하고, 조회하는 기능
 */
public class TransactionHistory {
    private final List<String> detailsList = new ArrayList<>();
    /**
     * 각 계좌의 거래 내역 기록
     */
    void addTransaction(String details) {
        detailsList.add(details);
    }

    /**
     *  모든 거래 내역을 조회 합니다
     */
    List<String> getAllTransactions(){
        return detailsList;
    }
}
