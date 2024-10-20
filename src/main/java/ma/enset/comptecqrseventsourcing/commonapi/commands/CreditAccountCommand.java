package ma.enset.comptecqrseventsourcing.commonapi.commands;

import lombok.Getter;

public class CreditAccountCommand extends BaseCommand<String>{
    @Getter
    double amount;
    @Getter
    private String currency;
    public CreditAccountCommand(String id, double amount, String currency) {
        super(id);
        this.amount = amount;
        this.currency = currency;
    }
}
