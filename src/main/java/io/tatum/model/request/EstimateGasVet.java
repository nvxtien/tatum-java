package io.tatum.model.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Optional;

public class EstimateGasVet {

//    @IsNotEmpty()
//    @Length(66, 66)
    @NotEmpty
    @Size(min = 66, max = 66)
    private String from;

//    @IsNotEmpty()
//    @Length(42, 42)
    @NotEmpty
    @Size(min = 42, max = 42)
    private String to;

//    @IsNotEmpty()
//    @IsNumberString()
//    @Matches(/^[+]?((\d+(\.\d*)?)|(\.\d+))$/)
    @NotEmpty
    @Pattern(regexp="^[+]?((\\d+(\\.\\d*)?)|(\\.\\d+))$")
    private String value;

//    @IsOptional()
//    @MaxLength(10000)
    @Size(max = 10000)
    private Optional<String> data;

//    @Min(0)
//    @IsOptional()
//    @IsInt()
    @Min(0)
    private Optional<Integer> nonce;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Optional<String> getData() {
        return data;
    }

    public void setData(Optional<String> data) {
        this.data = data;
    }

    public Optional<Integer> getNonce() {
        return nonce;
    }

    public void setNonce(Optional<Integer> nonce) {
        this.nonce = nonce;
    }
}
