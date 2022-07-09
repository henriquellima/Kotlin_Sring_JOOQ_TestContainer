package kotlin_spring.controller

import kotlin_spring.DTO.UserDTO
import kotlin_spring.models.tables.records.TbUsersRecord

import kotlin_spring.service.UserService
import mu.KotlinLogging
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController(private val userService: UserService) {

    private val logger = KotlinLogging.logger {};

    @PostMapping
    fun register(@Validated @RequestBody userDTO: UserDTO): ResponseEntity<TbUsersRecord> {
            return ResponseEntity.ok(userService.save(userDTO));
    }

    @GetMapping("/{id}")
    fun getByID(@PathVariable id:Int) : ResponseEntity<UserDTO> {
        val user:TbUsersRecord = (userService.getByID(id));
        return ResponseEntity.ok(UserDTO(user))
    }

    @GetMapping("")
    fun getAll(pageable: Pageable) : Page<TbUsersRecord> {
        return userService.getAll(pageable);
    }

}