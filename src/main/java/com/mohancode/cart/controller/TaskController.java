package com.mohancode.cart.controller;

import com.mohancode.cart.models.Task;
import com.mohancode.cart.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("task")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        taskRepository.save(task);
        return task;
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
        task.setId(id);
        return taskRepository.save(task);
    }


    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
         taskRepository.deleteById(id);
    }

//    @RestController
//    @RequestMapping("/weather")
//    public class WeatherController {
//
//        @Autowired
//        private WeatherRepository weatherRepository;
//
//        @DeleteMapping("/{id}")
//        public ResponseEntity<Void> deleteWeatherById(@PathVariable Long id) {
//            if (weatherRepository.existsById(id)) {
//                weatherRepository.deleteById(id);
//                return ResponseEntity.noContent().build();  // Returns 204 No Content
//            } else {
//                return ResponseEntity.notFound().build();   // Returns 404 Not Found
//            }
//        }
//    }
//
//
//    @RestController
//    @RequestMapping("/weather")
//    public class WeatherController {
//
//        @Autowired
//        private WeatherRepository weatherRepository;
//
//        @GetMapping("/{id}")
//        public ResponseEntity<Weather> getWeatherById(@PathVariable Long id) {
//            return weatherRepository.findById(id)
//                    .map(weather -> ResponseEntity.ok().body(weather))
//                    .orElse(ResponseEntity.notFound().build());
//        }
//    }


}
