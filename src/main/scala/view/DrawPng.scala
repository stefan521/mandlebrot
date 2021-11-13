package view

import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO
import javax.imageio.stream.ImageOutputStream

object DrawPng {

  def draw(image: MandlebrotImage): Unit = {
    val file: File = new File("mandlebrot.png")
    val img: BufferedImage = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB)
    val os: ImageOutputStream = ImageIO.createImageOutputStream(file)
    ImageIO.write(img, "png", os)
  }

}