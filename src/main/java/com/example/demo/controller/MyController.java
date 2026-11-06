package com.example.demo.controller;

import com.example.demo.model.Expense;
import com.example.demo.service.ExpenseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
public class MyController {
    private final ExpenseService expenseService;

    public MyController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    //Получаем все расходы из БД
    @GetMapping
    public List<Expense> getAllExpenses() {
        return expenseService.getAllExpenses();
    }

    //Сохраняем новый расход в БД
    @PostMapping
    public Expense addExpense(@RequestBody Expense newExpense) {
        return expenseService.saveExpense(newExpense);
    }

    @DeleteMapping("/{id}")
    public void deleteExpence(@PathVariable Long id){
        expenseService.deleteExpense(id);
    }
}