package org.example.lesson_11

const val MUTED_PARTICIPANT = "пользователь заглушен"
const val SPEAKING_PARTICIPANT = "разговаривает"
const val MICROPHONE_OFF = "микрофон выключен"

class SpeakingRoom(
    val cover: String,
    val name: String,
    val participantsList: MutableList<Participant> = mutableListOf(),
) {

    fun showRoomNameAndCover() {
        println("Обложка: $cover")
        println("Название комнаты: $name")
    }

    fun addParticipantToList(participant: Participant) {
        participantsList.add(participant)
    }

    fun updateParticipantStatus(participant: Participant, newStatus: String) {
        participant.status = newStatus
    }

    fun showParticipantName(participant: Participant) {
        println(participant.name)
    }

    fun showAllParticipants() {
        participantsList.forEach {
            println("id: ${it.id}\n" +
                    "photo: ${it.photo}\n" +
                    "name: ${it.name}\n" +
                    "status: ${it.status}")
        }
    }

}

class Participant(
    val id: Int,
    val photo: String,
    val name: String,
    var status: String = "микрофон выключен",
    )

fun main() {

    val participant = Participant(
        id = 1,
        photo = "SomePhoto",
        name = "David",
    )

    val speakingRoom = SpeakingRoom(
        cover = "someCover",
        name = "English Class",
    )

    speakingRoom.showRoomNameAndCover()
    speakingRoom.addParticipantToList(participant)
    speakingRoom.showParticipantName(participant)
    speakingRoom.showAllParticipants()
    speakingRoom.updateParticipantStatus(participant, MUTED_PARTICIPANT)
    speakingRoom.showAllParticipants()

}