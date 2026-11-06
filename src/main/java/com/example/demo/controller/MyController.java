package com.example.demo.controller;

import com.example.demo.model.Expense;
import com.example.demo.repository.ExpenseRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import java.util.List;

@RestController
public class MyController {
    private final ExpenseRepository expenseRepository;

    //Внедрение репозитория через конструктор
    public MyController(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    //Получаем все расходы из БД
    @GetMapping("/expenses")
    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    //Сохраняем новый расход в БД
    @PostMapping("/expenses")
    public Expense addExpense(@RequestBody Expense newExpense) {
        return expenseRepository.save(newExpense);
    }

    @DeleteMapping("/expenses/{id}")
    public void deleteExpence(@PathVariable Long id){
        expenseRepository.deleteById(id);
    }
}