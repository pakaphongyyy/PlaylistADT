import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Playlist — ADT แทนรายการเพลงที่ผู้ใช้จัดลำดับไว้
 *
 * ค่านามธรรม (A): ลำดับของเพลง เช่น [เพลงA, เพลงB, เพลงC]
 *
 * ตัวอย่างการใช้งาน:
 *     Playlist p = new Playlist();
 *     p.add("Bohemian Rhapsody");
 *     p.add("Imagine");
 *     System.out.println(p.size());   // 2
 */
public class Playlist {

    public static final int MAX_SONGS = 100;

    // ===== representation =====
    private final List<String> songs;

    // TODO 1: เขียน Abstraction Function ตรงนี้
    // Abstraction Function:
    //   AF(songs) = ...

    // TODO 2: เขียน Representation Invariant ตรงนี้ (4 ข้อ)
    // Representation Invariant:
    //   ...

    // TODO 3: เขียน Safety from rep exposure ตรงนี้
    // Safety from rep exposure:
    //   ...

    /**
     * TODO 4: เขียน checkRep()
     * แปลง RI ทุกข้อเป็น assert หนึ่งบรรทัด พร้อมข้อความอธิบาย
     */
    private void checkRep() {
        // เขียนโค้ดตรงนี้
    }

    // ===== Creator =====

    /**
     * สร้างเพลย์ลิสต์ว่าง
     */
    public Playlist() {
        this.songs = new ArrayList<>();
        checkRep();
    }

    /**
     * TODO 5: Creator ตัวที่สอง
     * สร้างเพลย์ลิสต์จากรายชื่อเพลงที่ให้มา
     *
     * ระวัง: ห้ามเก็บ reference ของ initial ตรง ๆ (rep exposure!)
     *
     * @param initial รายชื่อเพลงเริ่มต้น ต้องไม่ซ้ำและไม่เกิน MAX_SONGS
     * @throws IllegalArgumentException ถ้า initial ผิดเงื่อนไข
     */
    public Playlist(List<String> initial) {
        this.songs = null;   // แก้บรรทัดนี้
        // เขียนโค้ดตรงนี้
    }

    // ===== Mutators =====

    /**
     * TODO 6: เพิ่มเพลงต่อท้ายเพลย์ลิสต์
     *
     * @param song ชื่อเพลง ต้องไม่เป็น null และไม่เป็นสตริงว่าง
     * @return true ถ้าเพิ่มสำเร็จ, false ถ้ามีเพลงนี้อยู่แล้วหรือเต็มแล้ว
     * @throws IllegalArgumentException ถ้า song เป็น null หรือสตริงว่าง
     */
    public boolean add(String song) {
        return false;   // แก้บรรทัดนี้
    }

    /**
     * TODO 7: ลบเพลงออกจากเพลย์ลิสต์
     *
     * @param song ชื่อเพลงที่ต้องการลบ
     * @return true ถ้าลบสำเร็จ, false ถ้าไม่พบเพลงนี้
     */
    public boolean remove(String song) {
        return false;   // แก้บรรทัดนี้
    }

    // ===== Observers =====

    /**
     * TODO 8: คืนจำนวนเพลงในเพลย์ลิสต์
     */
    public int size() {
        return -1;   // แก้บรรทัดนี้
    }

    /**
     * TODO 9: ตรวจว่ามีเพลงนี้อยู่หรือไม่
     */
    public boolean contains(String song) {
        return false;   // แก้บรรทัดนี้
    }

    /**
     * TODO 10: คืนรายชื่อเพลงทั้งหมดตามลำดับ
     *
     * ระวัง: ห้ามคืน reference ของ songs ตรง ๆ (rep exposure!)
     */
    public List<String> songs() {
        return null;   // แก้บรรทัดนี้
    }

    // ===== Producer =====

    /**
     * TODO 11: คืนเพลย์ลิสต์ใหม่ที่มีเพลงเดียวกันแต่สลับลำดับ
     *
     * ระวัง: ห้ามแก้เพลย์ลิสต์เดิม (this) เด็ดขาด
     *
     * @return เพลย์ลิสต์ใหม่ที่สลับลำดับแล้ว
     */
    public Playlist shuffled() {
        return null;   // แก้บรรทัดนี้
    }

    @Override
    public String toString() {
        return songs.toString();
    }
}
