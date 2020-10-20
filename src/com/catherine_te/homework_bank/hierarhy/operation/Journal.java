package com.catherine_te.homework_bank.hierarhy.operation;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    private List<Operation> operationList;

    public Journal() {
        this.operationList = new ArrayList<>();
    }

    public List<Operation> getOperationList() {
        return operationList;
    }

    public void setOperationList(List<Operation> operationList) {
        this.operationList = operationList;
    }
}
