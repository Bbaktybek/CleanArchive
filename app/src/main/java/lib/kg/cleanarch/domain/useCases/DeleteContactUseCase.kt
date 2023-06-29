package lib.kg.cleanarch.domain.useCases

import lib.kg.cleanarch.data.models.ContanctEntity
import lib.kg.cleanarch.domain.repositories.ContactRepository

class DeleteContactUseCase(
    private val contactRepository: ContactRepository
) {
    fun deleteContact(contactEntity: ContanctEntity) {
        contactRepository.deleteContact(contactEntity)
    }
}