func majorityElement(nums []int) int {
    var el int

    ct:=0

    for _, num := range nums {
        if ct == 0 {
            el = num
            ct++
            continue
        }
        if num == el {
            ct++
        } else {
            ct--
        }
        
    }

    return el
}