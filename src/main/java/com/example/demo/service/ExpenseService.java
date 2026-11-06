package com.example.demo.service;

import com.example.demo.model.Expense;
import com.example.demo.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {
    //Ссылка на репозиторий для работы с БД
    private final ExpenseRepository expenseRepository;

    //Внедряет зависимости
    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    //Блок получения данных
    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    //Блок сохранения
    public Expense saveExpense(Expense expense){
        return expenseRepository.save(expense);
    }

    //Блок удаления
    public void deleteExpense(Long id) {
        //Проверка существование записи
        if (!expenseRepository.existsById(id)){
            throw new RuntimeException("Расход с ID " + id + " не найден");
        }
        expenseRepository.deleteById(id);
    }
}
