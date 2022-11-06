package ru.sber.services

import org.springframework.beans.factory.config.BeanDefinition
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Service

@Service
class SingletonService

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
class PrototypeService