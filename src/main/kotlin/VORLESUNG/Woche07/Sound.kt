package VORLESUNG.Woche07

import java.io.File
import javax.sound.sampled.AudioInputStream
import javax.sound.sampled.AudioSystem
import javax.sound.sampled.Clip
import javax.sound.sampled.FloatControl

fun main() {

    val intro: String = "src/main/kotlin/audio/intro.wav"
    val magic: String = "src/main/kotlin/audio/magic.wav"

    println("In der main den Sound spielen...")
    playSound(magic)
    println("1. Code Zeile nach dem Aufruf von playSound...")
    Thread.sleep(3000)
    println("2. Code Zeile nach dem Aufruf von playSound...")
    Thread.sleep(3000)
    println("3. Code Zeile nach dem Aufruf von playSound...")
    Thread.sleep(3000)
    println("4.Code Zeile nach dem Aufruf von playSound...")
    Thread.sleep(3000)
    println("5.Code Zeile nach dem Aufruf von playSound...")
    Thread.sleep(3000)
    println("6.Code Zeile nach dem Aufruf von playSound...")
    Thread.sleep(3000)


}

fun playSound(audioPath: String) {
    // Erstelle eine Datei aus dem angegebenen Dateipfad
    val audio: File = File(audioPath)

    // Hier wird die audio in das Audiosystem gepackt
    val audioInput: AudioInputStream = AudioSystem.getAudioInputStream(audio)

    // es wird ein Clip-Objekt erstellt um den Sound abzuspielen
    val clip: Clip = AudioSystem.getClip()

    // clip öffnen, audio laden
    clip.open(audioInput)



    // Starte die Wiedergabe des Sounds
    clip.start()

    // Thread erstellen
    val soundThread: Thread = Thread{
        while (clip.isRunning){
            Thread.sleep(5000) // 5sek Pause
            println("Thread ${Thread.currentThread().name} läuft noch...")
        }
        println("Sound Clip ist beendet, Thread ${Thread.currentThread().name} wird beendet...")
    }

    // Thread starten
    soundThread.start()



    // Volume Control:

    // FloatControl steuert Audios (zB Lautstärke)
    // MASTER_GAIN ist eine spezielle Art von FloatControl, die die Lautstärke eines Audio-Clips oder eines anderen Audioverarbeitungselements regelt
    val volume: FloatControl = clip.getControl(FloatControl.Type.MASTER_GAIN) as FloatControl
    // 0.99 = fast das maximum, spektrum geht von 0 (kein Sound) bis 1 (lautester Sound)
    volume.value = volume.minimum+(0.99f*(volume.maximum-volume.minimum))



}
